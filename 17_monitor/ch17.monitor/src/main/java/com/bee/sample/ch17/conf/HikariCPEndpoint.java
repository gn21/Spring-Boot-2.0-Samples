package com.bee.sample.ch17.conf;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;

import com.zaxxer.hikari.HikariConfigMXBean;
import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.HikariPoolMXBean;
/**
 * 通过访问/appliclation/hikariCP 获取数据源状态，通过提交
 * <pre>
 * curl -H 'Content-Type:application/json' --data '{"max":5}' http://127.0.0.1:8081/application/hikariCP/total
 * </pre>
 * 设置数据源最大连接数
 * @author lijiazhi
 *
 */
@Endpoint(id = "hikariCP")
public class HikariCPEndpoint {
	HikariDataSource ds;
	
	public HikariCPEndpoint(HikariDataSource ds) {
		this.ds = ds;
		
	}
    @ReadOperation
    public Map<String, Object> info() { 
    		HashMap map  = new HashMap();
    		HikariPoolMXBean mxBean = ds.getHikariPoolMXBean();
    		HikariConfigMXBean configBean = ds.getHikariConfigMXBean();
    		map.put("total",configBean.getMaximumPoolSize());
    		map.put("active", mxBean.getActiveConnections());
    		map.put("idle", mxBean.getIdleConnections());
    		map.put("threadWait", mxBean.getThreadsAwaitingConnection());
     	return map;
    }
    
    @WriteOperation
    public void setMax(int max) {
    		ds.getHikariConfigMXBean().setMaximumPoolSize(max);
     		
    }
}