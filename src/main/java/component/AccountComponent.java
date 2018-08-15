package component;

import com.spring.ApplicationContentHolder;
import db.bean.TAccount;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AccountComponent {

    private Logger logger = LoggerFactory.getLogger(AccountComponent.class);

    public void testAccount(){
        mybatis.AccountDao accountDao = ApplicationContentHolder.getExtBean(mybatis.AccountDao.class);
        TAccount tAccount = accountDao.selectByAccountId(100004);

        logger.info("account is name : "+ tAccount.getAccountName()+"\n");

        tAccount.setAccountName("nihao");
        int count = accountDao.update(tAccount);
        if(count > 0){
            logger.info("update AccountName is success, accountName: {}", tAccount.getAccountName());
        }
    }

}
