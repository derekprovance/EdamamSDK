package com.derekprovance.edamam.Service;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Field;

public abstract class QueryParametersObject {
    //TODO(Derek) - Handle range parameters
    //TODO(Derek) - Figure out why the MealType parameter is not working

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            Field[] fields = getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                if (field.get(this) != null) {
                    stringBuilder
                            .append("&")
                            .append(getFieldName(field))
                            .append("=")
                            .append(getFieldVariable(field));
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return stringBuilder.toString();
    }

    private String getFieldName(Field field) {
        SerializedName serializedName = field.getAnnotation(SerializedName.class);

        String fieldName = field.getName();
        if(serializedName != null) {
            fieldName = serializedName.value();
        }

        return fieldName;
    }

    private String getFieldVariable(Field field) throws IllegalAccessException {
        return field.get(this).toString().replace(" ", "%20");
    }
}
