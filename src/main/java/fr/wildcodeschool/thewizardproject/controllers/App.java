package fr.wildcodeschool.thewizardproject.controllers;

import fr.wildcodeschool.thewizardproject.models.Gandalf;
import fr.wildcodeschool.thewizardproject.models.WizardInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public void start() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");

        WizardInterface wizard = context.getBean("theWizard", WizardInterface.class);

        context.close();

        System.out.println("********************");
        System.out.println(wizard.giveAdvice());
        System.out.println("********************");
        System.out.println(wizard.changeDress());
        System.out.println("********************");

    }
}
