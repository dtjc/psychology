package com.dt.psychology.domain;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.dt.psychology.domain.Article;
import com.dt.psychology.domain.User;

import com.dt.psychology.domain.ArticleDao;
import com.dt.psychology.domain.UserDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig articleDaoConfig;
    private final DaoConfig userDaoConfig;

    private final ArticleDao articleDao;
    private final UserDao userDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        articleDaoConfig = daoConfigMap.get(ArticleDao.class).clone();
        articleDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        articleDao = new ArticleDao(articleDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);

        registerDao(Article.class, articleDao);
        registerDao(User.class, userDao);
    }
    
    public void clear() {
        articleDaoConfig.clearIdentityScope();
        userDaoConfig.clearIdentityScope();
    }

    public ArticleDao getArticleDao() {
        return articleDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

}