package net.sunnada.dubbo.service.impl;


import com.alibaba.dubbo.container.Main;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
public class DemoServiceImplTest {

//    @Resource
//    private DemoService demoService;
//
//    @Test
//    public void test1(){
//        System.out.println(demoService.demo("ariel"));
//        try {
//            System.in.read();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//    @Test
//    public void test2(){
//    }

    public static void main(String[] args) {
        //官方推荐的写法
        //要求配置文件放在/META-INF/spring/*.xml
        Main.main(args);
    }
}
