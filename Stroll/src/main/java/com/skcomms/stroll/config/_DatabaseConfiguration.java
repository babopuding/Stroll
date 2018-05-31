package com.skcomms.stroll.config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@Resource
public class _DatabaseConfiguration {

	/**
	 * Map DataSource SET
	 * @return
	 */
//	@PRIMARY
//	@BEAN
//	@CONFIGURATIONPROPERTIES(PREFIX = "SPRING.DATASOURCE")
//	PUBLIC DATASOURCE DATASOURCEMAP() {
////		RETURN DATASOURCEBUILDER.CREATE().BUILD();
//		RETURN NEW HIKARIDATASOURCE();
//	}
//	
//	@BEAN//@AUTOWIRED @QUALIFIER("DATASOURCEMAP") DATASOURCE DATASOURCE
//	PUBLIC SQLSESSIONFACTORY SQLSESSIONFACTORY_MAP() THROWS EXCEPTION {
//		SQLSESSIONFACTORYBEAN FACTORYBEAN = NEW SQLSESSIONFACTORYBEAN();
//		FACTORYBEAN.SETDATASOURCE(DATASOURCEMAP());
//		PATHMATCHINGRESOURCEPATTERNRESOLVER RESOLVER = NEW PATHMATCHINGRESOURCEPATTERNRESOLVER();
////		FACTORYBEAN.SETMAPPERLOCATIONS(RESOLVER.GETRESOURCES("CLASSPATH:COM/SKCOMMS/STROLL/MAP/*.XML"));
//		FACTORYBEAN.SETMAPPERLOCATIONS(RESOLVER.GETRESOURCES("CLASSPATH:MAPPER/MYBATIS_SQL.XML"));
//		RETURN FACTORYBEAN.GETOBJECT();
//	}
//	
//	@BEAN//@AUTOWIRED @QUALIFIER("SQLSESSIONFACTORY_MAP") SQLSESSIONFACTORY SQLSESSIONFACTORY
//	PUBLIC SQLSESSIONTEMPLATE SQLSESSION_MAP() THROWS EXCEPTION {
//		RETURN NEW SQLSESSIONTEMPLATE(SQLSESSIONFACTORY_MAP());
//	}
	
	
	
	/**
	 * Admin DataSource SET
	 * @return
	 */
//	@Bean
//	@ConfigurationProperties(prefix = "spring.datasource")
//	public DataSource dataSourceAdmin() {
//		return DataSourceBuilder.create().build();
//		//return new HikariDataSource();
//	}
//	
//	@Bean//@Autowired @Qualifier("dataSourceAdmin") DataSource dataSource
//	public SqlSessionFactory sqlSessionFactory_admin() throws Exception {
//		SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
//		factory.setDataSource(dataSourceAdmin());
//		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//		factory.setMapperLocations(resolver.getResources("classpath:com/skcomms/stroll/admin/*.xml"));
//		return factory.getObject();
//	}
//	
//	@Bean//@Autowired @Qualifier("sqlSessionFactory_admin") SqlSessionFactory sqlSessionFactory
//	public SqlSessionTemplate sqlSession_admin() throws Exception {
//		return new SqlSessionTemplate(sqlSessionFactory_admin());
//	}
	
}
