package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("gandalf")
public class Gandalf implements WizardInterface {

    private DressInterface dress;

    @Autowired
    public Gandalf(@Qualifier("dress") DressInterface dressInterface) {
        this.dress = dressInterface;
    }

    @Override
    public String giveAdvice() {
        return "Tu peux réussir cette quête !";
    }

    @Override
    public String changeDress() {
        return this.dress.changeDress();
    }

}
