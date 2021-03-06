package com.bee.sample.ch17.conf;

import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnEnabledEndpoint;
import org.springframework.boot.actuate.trace.InMemoryTraceRepository;
import org.springframework.boot.actuate.trace.TraceRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义的监控指标,跟踪http，还有数据源监控
 *
 * @author xiandafu
 */
@Configuration
public class AcutatorExtConfig {

    @ConditionalOnMissingBean(TraceRepository.class)
    @Bean
    public InMemoryTraceRepository traceRepository() {
        InMemoryTraceRepository httpTrace = new InMemoryTraceRepository();
        httpTrace.setCapacity(2);
        return httpTrace;
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnEnabledEndpoint
    public HikariCPEndpoint testDataEndpoint(DataSource ds) {
        return new HikariCPEndpoint((HikariDataSource) ds);
    }


}
