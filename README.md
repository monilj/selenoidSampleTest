# selenoidSampleTest
Selenide is a wrapper for Selenium WebDriver that allows you easier and faster writing of UI Tests. With Selenide you can concentrate on business logic instead of solving all these endless browser/ajax/timeouts problems.


This is a sample project demonstrating how to test Google search UI with Selenide (Selenium webdriver).


Add this dependencies in to build.gradle:

`
dependencies {
  testCompile 'com.codeborne:selenide:4.13.0'
}
`

Maven Users add this dependencies in to pom.xml 

```

  <dependency>

    <groupId>com.codeborne</groupId>
    
    <artifactId>selenide</artifactId>
    
    <version>4.13.0</version>
    
    <scope>test</scope>
    
  </dependency>

```


Add this code to java class

``````

  import static com.codeborne.selenide.Selenide.*;

  import static com.codeborne.selenide.Condition.*;


  @Test

  public void userCanLoginByUsername() {

  open("https://www.google.com/");
  
        $(By.name("q")).setValue("johny").pressEnter();
        
        System.out.println("searched johny");
        
        
       }
       
``````
