package geco;


import org.apache.commons.lang3.RandomStringUtils;

/**
 * Classe permettant la génération de mot de passe.
 */
public class PasswordGenerator {

    /**
     * La taille du mot de passe à modifier.
     */
    private final int lengthPassword = 8;

    /**
     * Génère le mot de passe de manière aléatoire.
     *
     * @return RandomStringUtils.random le mot de passe créé
     */
    public final String getRandomPassword() {

        int length = lengthPassword;
        boolean numbers = false;
        boolean letters = true;

        return RandomStringUtils.random(length, letters, numbers);

    }


}
