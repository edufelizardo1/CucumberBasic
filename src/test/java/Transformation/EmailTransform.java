package Transformation;


import cucumber.api.Transformer;

/**
 * @author edufelizardo1@gmail.com
 * @version 1.0.0
 * Created by BRP...-PC on 30/10/2021
 */
public class EmailTransform extends Transformer<String> {

    @Override
    public String transform(String userName) {
        return userName.concat("@ea.com");
    }
}
