package factory;


public class FactoryPattern {

  public Handler getHandler() {
    if(System.getProperty("os.name").equals("Linux")) {
      return new LinuxHandler();
    }
    else if(System.getProperty("os.name").equals("Windows")) {
      return new WindowsHandler();
    }
    else {
      return new GenericHandler();
    }
  }

  public static void main(String[] args) throws Exception {
    FactoryPattern patternObj = new FactoryPattern();
    patternObj.getHandler().handle();
  }
}

