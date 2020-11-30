package com.luban;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@ComponentScan("com.luban")
public class AppConfig {



	// 自动代理 BeanPost
//	@Bean
//	public BeanNameAutoProxyCreator creator(){
//		// BeanPostProcessor
//		BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
//		beanNameAutoProxyCreator.setBeanNames("userService");  // bean==>AOP
//		beanNameAutoProxyCreator.setInterceptorNames("myAdvisor");
//		return beanNameAutoProxyCreator;
//	}

	// 哪些bean需要被代理？  MyAdvisor  PointCut
	// 代理逻辑
	// 添加了BeanPostProcessor
//	@Bean
//	public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
//		DefaultAdvisorAutoProxyCreator creator = new DefaultAdvisorAutoProxyCreator();
//		return creator;
//	}

//	@Bean
//	public  MapperScannerConfigurer configurer(){
//		MapperScannerConfigurer configurer = new MapperScannerConfigurer();
//		configurer.setBasePackage("com.luban.dao");
//
//		return configurer;
//	}
//
//	@Bean
//	public DataSource dataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setUrl("jdbc:mysql://192.168.40.52:3306/luban?useSSL=false");
//		dataSource.setUsername("root");
//		dataSource.setPassword("Zhouyu123456***");
//		return dataSource;
//	}
//
//	@Bean
//	public SqlSessionFactory sqlSessionFactory() {
//		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
//		sessionFactoryBean.setDataSource(dataSource());
//		try {
//			return sessionFactoryBean.getObject();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return null;
//	}

	// 事务管理器
//	@Bean
//	public PlatformTransactionManager transactionManager() {
//		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
//		transactionManager.setDataSource(dataSource());
//
//		// 设置要不要把事务信息同步到线程中
////		transactionManager.setTransactionSynchronization();
//
//		return transactionManager;
//	}


}
