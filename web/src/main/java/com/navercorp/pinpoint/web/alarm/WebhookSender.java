package com.navercorp.pinpoint.web.alarm;

import com.navercorp.pinpoint.web.alarm.checker.AlarmChecker;
import org.springframework.batch.core.StepExecution;

public interface WebhookSender {
    void sendWebhook(AlarmChecker checker, int sequenceCount, StepExecution stepExecution);
}
