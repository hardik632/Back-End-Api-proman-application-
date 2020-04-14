//package com.upgrad.proman.service.dao;
//
//import com.upgrad.proman.service.business.PasswordCryptographyProvider;
//import com.upgrad.proman.service.entity.UserAuthTokenEntity;
//import com.upgrad.proman.service.entity.UserEntity;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import sun.security.util.Password;
//
//import javax.persistence.EntityManager;
//import javax.persistence.NoResultException;
//import javax.persistence.PersistenceContext;
//
//@Repository
//public class UserDao {
//
//
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    public UserEntity createUser(UserEntity userEntity){
//        entityManager.persist(userEntity);
//        return userEntity;
//    }
//
//    public UserEntity getUser(final String userUuid){
//        try{
//            return entityManager.createNamedQuery("userByUuid",UserEntity.class).setParameter("uuid",userUuid).getSingleResult();
//        }catch(NoResultException nre){
//            return null;
//        }
//    }
//
//    public UserEntity getUserByEmail(final String email) {
//        try {
//            return entityManager.createNamedQuery("userByEmail", UserEntity.class).setParameter("email", email)
//                    .getSingleResult();
//        } catch (NoResultException nre) {
//            return null;
//        }
//    }
//
//    public UserAuthTokenEntity createAuthToken(final UserAuthTokenEntity userAuthTokenEntity){
//        entityManager.persist(userAuthTokenEntity);
//        return userAuthTokenEntity;
//    }
//
//    public void updateUser(final UserEntity updatedUserEntity){
//        entityManager.merge(updatedUserEntity);
//    }
//}
