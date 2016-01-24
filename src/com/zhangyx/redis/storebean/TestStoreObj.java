package com.zhangyx.redis.storebean;

import javax.management.MXBean;

import org.junit.Before;
import org.junit.Test;

import redis.clients.jedis.Jedis;

public class TestStoreObj {

	private Jedis jedis;
	
	@Before
	public void testStoreBean(){
		jedis = new Jedis("localhost",6379);
	}
	
	@Test
	public void testStoreObj(){
		Person person = new Person();
		person.setAge(11);
		person.setUsername("zhangxy");
		jedis.set("person".getBytes(), SerializeUtil.serialize(person));
		
		
		byte[] personByte = jedis.get("person".getBytes());
		Person  p = (Person) SerializeUtil.unSerizlize(personByte);
		System.out.println(String.format("ƒÍ¡‰£∫%s,–’√˚£∫%s", p.getAge(),p.getUsername()));
	}
	
}
