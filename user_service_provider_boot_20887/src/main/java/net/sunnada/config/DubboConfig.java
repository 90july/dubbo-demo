package net.sunnada.config;

import com.alibaba.dubbo.config.*;
import net.sunnada.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DubboConfig {
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("user_service_provider_boot");
        return applicationConfig;
    }
    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        //关闭启动时检查注册中心是否可用
        registryConfig.setCheck(false);
        return registryConfig;
    }
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20887);
        return protocolConfig;
    }
    @Bean
    public MonitorConfig monitorConfig(){
        MonitorConfig monitorConfig = new MonitorConfig();
        monitorConfig.setProtocol("registry");
        return monitorConfig;
    }
    @Bean
    public ServiceConfig<UserService> userServiceConfig(UserService userService){
        ServiceConfig userServiceConfig = new ServiceConfig();
        userServiceConfig.setInterface(UserService.class);
        userServiceConfig.setRef(userService);
//        MethodConfig userMethodConfig = new MethodConfig();
//        userMethodConfig.setTimeout(2000);
//        List<MethodConfig> methods = new ArrayList<>(0);
//        methods.add(userMethodConfig);
//        userServiceConfig.setMethods(methods);
        return userServiceConfig;
    }
}
