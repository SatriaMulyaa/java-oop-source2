package programmer.zaman.now.application;

import programmer.zaman.now.data.Application;
import programmer.zaman.now.data.Constant;
import programmer.zaman.now.data.Country;
import programmer.zaman.now.utill.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constant.APLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(MathUtil.sum(1,1,1,1,1));

        Country.City city = new Country.City();
        city.setName("batavia");
        System.out.println(city.getName());

        System.out.println(Application.PROCESSORS);
    }
}
