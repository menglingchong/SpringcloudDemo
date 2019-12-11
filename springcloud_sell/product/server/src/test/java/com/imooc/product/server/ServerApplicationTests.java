package com.imooc.product.server;

import com.imooc.product.server.dataobject.ProductInfo;
import com.imooc.product.server.repository.ProductInfoRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServerApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private ProductInfoRepository productInfoRepository;

	@Test
	public void findByProductStatus() {
		List<ProductInfo> list = productInfoRepository.findByProductStatus(0);
		Assert.assertTrue(list.size() > 0);
	}

}
