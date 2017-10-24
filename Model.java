/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.math.BigInteger;

public class Model {
    private static final String INITIAL_VALUE = "0";
    private BigInteger m_total;  

    Model() {
        reset();
    }
    public void reset() {
        m_total = new BigInteger(INITIAL_VALUE);
    }
    public void multiplyBy(String operand) {
        m_total = m_total.multiply(new BigInteger(operand));
    }
    public void setValue(String value) {
        m_total = new BigInteger(value);
    }
    public String getValue() {
        return m_total.toString();
    }
}