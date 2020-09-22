package com.navercorp.pinpoint.web.dao.memory;

import com.navercorp.pinpoint.web.dao.UserGroupDao;
import com.navercorp.pinpoint.web.vo.User;
import com.navercorp.pinpoint.web.vo.UserGroupMember;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MemoryUserDaoTest {
    
    @Mock
    private UserGroupDao userGroupDao;
    
    @InjectMocks
    private  MemoryUserDao memoryUserDao;
    
    private User createFakeUser(String userID, String dep, String name) {
        return new User(userID, name, dep, 82, "", "");
    }
    
    @Test
    public void insertUser() {
        User inputUser = createFakeUser("user1", "dep", "name");
        memoryUserDao.insertUser(inputUser);
        User selectedUser = memoryUserDao.selectUserByUserId("user1");
        assertEquals(inputUser.getUserId(), selectedUser.getUserId());
        assertEquals("0", selectedUser.getNumber());
    }

    @Test
    public void insertUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(createFakeUser("user1", "dep", "name"));
        userList.add(createFakeUser("user2", "dep", "name"));
    
        memoryUserDao.insertUserList(userList);
        
        List<User> selectedUserList = memoryUserDao.selectUser();
        assertEquals(2, selectedUserList.size());
    }
    
    @Test
    public void selectUserByDepartment() {
        User inputUser1 = createFakeUser("user1", "dep1", "name");
        User inputUser2 = createFakeUser("user2", "dep2", "name");
    
        memoryUserDao.insertUser(inputUser1);
        memoryUserDao.insertUser(inputUser2);
    
        List<User> selectedUserList = memoryUserDao.selectUserByDepartment("dep1");
        assertEquals(1, selectedUserList.size());
    }
    
    @Test
    public void selectUserByUserName() {
        User inputUser1 = createFakeUser("user1", "dep1", "name1");
        User inputUser2 = createFakeUser("user2", "dep1", "name2");
    
        memoryUserDao.insertUser(inputUser1);
        memoryUserDao.insertUser(inputUser2);
        
        List<User> selectedUserList = memoryUserDao.selectUserByUserName("name1");
        assertEquals(1, selectedUserList.size());
    }
    
    @Test
    public void selectUserByUserGroupId() {
        User inputUser1 = createFakeUser("user1", "dep1", "name1");
        User inputUser2 = createFakeUser("user2", "dep1", "name2");
        memoryUserDao.insertUser(inputUser1);
        memoryUserDao.insertUser(inputUser2);
    
        UserGroupMember userGroupMember1 = new UserGroupMember();
        userGroupMember1.setName("name1");
        userGroupMember1.setDepartment("dep1");
        userGroupMember1.setMemberId("user1");
        userGroupMember1.setUserGroupId("userGroupId");
        
        List<UserGroupMember> userGroupMembers = new ArrayList<>();
        userGroupMembers.add(userGroupMember1);
        
        when(userGroupDao.selectMember("userGroupId")).thenReturn(userGroupMembers);
        List<User> selectedUserList = memoryUserDao.selectUserByUserGroupId("userGroupId");
    
        assertEquals(userGroupMember1.getMemberId(), selectedUserList.get(0).getUserId());
        assertEquals(userGroupMember1.getName(), selectedUserList.get(0).getName());
    }
    
    @Test
    public void dropAndCreateUserTable() {
        memoryUserDao.dropAndCreateUserTable();
        List<User> selectedUserList = memoryUserDao.selectUser();
        assertEquals(0, selectedUserList.size());
    }
}
