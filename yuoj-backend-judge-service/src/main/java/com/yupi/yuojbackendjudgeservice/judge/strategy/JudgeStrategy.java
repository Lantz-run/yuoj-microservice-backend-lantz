package com.yupi.yuojbackendjudgeservice.judge.strategy;

/**
 * <p>Project: yuoj-backend
 * <p>Powered by Lantz On 2025/2/9
 *
 * @author Lantz
 * @version 1.0
 * @Description JudgeStrategy
 * @since 1.8
 */

import com.yupi.yuojbackendmodel.model.codesandbox.JudgeInfo;

/**
 * 判题策略
 */
public interface JudgeStrategy {

    /**
     * 执行判题1
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
