package day47_Abstraction;

public abstract class RemoteWebDriver {
    protected abstract  void get(String URL);//javada sadece body si olmauan abstraction
        //There ara onl Two ways to Achieve Abstarction:
       // 1-Abstract class meant to be inherited
        public abstract void quit();


    //if abstarct kullanmissan final kullanamzsin su ile ates gibi
                //2Interface
       // Abstract method :a method without the body2--a method thats meant to be override(cannot private,static ,final can not override them

    }





