package br.edu.ifmg.produto.resources.exceptions;


import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

    private List<FieldMessage> erros = new ArrayList<FieldMessage>();

    public ValidationError() {}

    public List<FieldMessage> getFieldMessages() {
        return erros;
    }

    public void setFieldMessages(List<FieldMessage> fieldMessages) {
        this.erros = fieldMessages;
    }

    public void addFieldMessage(String field, String message) {
        this.erros.add(new FieldMessage(field, message));
    }
}
