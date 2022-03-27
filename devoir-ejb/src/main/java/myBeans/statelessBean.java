package myBeans;

import javax.ejb.Stateless;

@Stateless(name = "statelessEJB")
public class statelessBean {
    public statelessBean() {
    }
    public String hello(){
      return "hello world";
    }
}
