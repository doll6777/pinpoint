package com.navercorp.pinpoint.web.alarm;

import com.navercorp.pinpoint.web.alarm.checker.AlarmChecker;
import org.springframework.batch.core.StepExecution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class WebHookSenderImpl implements WebhookSender {

    @Autowired
    private final RestTemplate restTemplate;

    public WebHookSenderImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public void sendWebhook(AlarmChecker checker, int sequenceCount, StepExecution stepExecution) {
        String webHookUrl = checker.getRule().getWebhookUrl();
    }
}
