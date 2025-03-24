package com.yupi.yuojbackendjudgeservice.judge;

import com.yupi.yuojbackendjudgeservice.judge.strategy.*;
import com.yupi.yuojbackendmodel.model.codesandbox.JudgeInfo;
import com.yupi.yuojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * <p>Project: yuoj-backend
 * <p>Powered by Lantz On 2025/2/9
 *
 * @author Lantz
 * @version 1.0
 * @Description JudgeManager
 * @since 1.8
 */

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {
    /**
     * 判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext){
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)){
            judgeStrategy = new JavaLanguagetJudgeStrategy();
        }
        if ("cpp".equals(language)){
            judgeStrategy = new CppLanguagetJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
