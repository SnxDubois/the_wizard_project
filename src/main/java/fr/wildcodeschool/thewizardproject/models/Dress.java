package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component
public class Dress implements DressInterface {

    @Override
    public String changeDress() {
        return "The wizard's dress is blue !";
    }
}
