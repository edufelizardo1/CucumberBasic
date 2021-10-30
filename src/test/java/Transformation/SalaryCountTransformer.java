package Transformation;

import cucumber.api.Transformer;

/**
 * @author edufelizardo1@gmail.com
 * @version 1.0.0
 * Created on 30/10/2021
 */
public class SalaryCountTransformer extends Transformer {
    @Override
    public Object transform(String salary) {
        return salary.length();
    }
}
