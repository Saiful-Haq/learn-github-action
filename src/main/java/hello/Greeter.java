package hello;



public class Greeter {



  private String name = "";



  public String getName() 

  {

    return name;

  }



  public void setName(String name) 

  {

      this.name = name;

  }



  public String sayHello() 

  {

  	if (name == "") 

    {

       return "Helloooeeee!";

    }

    else 

    {

       return "Hello " + name + "!";

    }

  }

}
