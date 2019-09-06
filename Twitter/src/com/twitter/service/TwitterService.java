package com.twitter.service;

import com.twitter.dao.TwitterDAO;
import com.twitter.dao.TwitterDAOInterface;
import com.twitter.entity.TwitterEmployee;

public class TwitterService implements TwitterServiceInterface
{
public static TwitterServiceInterface createServiceObject() 
{
		// TODO Auto-generated method stub
		return new TwitterService();
	}

@Override
public int createProfile(TwitterEmployee te) 
{
	TwitterDAOInterface td = TwitterDAO.createDaoObject();
	return td.createProfileDAO(te);
}

}
