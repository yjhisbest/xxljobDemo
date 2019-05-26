package com.yjh.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.springframework.stereotype.Component;

@JobHandler(value="activity2")
@Component
public class ActivityJobHandler2 extends IJobHandler {
    @Override
    public ReturnT<String> execute(String s) throws Exception {
        return null;
    }
}
