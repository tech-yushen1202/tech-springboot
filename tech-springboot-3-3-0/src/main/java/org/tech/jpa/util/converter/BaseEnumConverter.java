package org.tech.jpa.util.converter;

import org.hibernate.type.StandardConverter;
import org.hibernate.type.descriptor.java.EnumJavaType;
import org.hibernate.type.descriptor.java.JavaType;
import org.hibernate.type.descriptor.java.StringJavaType;
import org.tech.jpa.enums.EnumCommonApi;
import org.tech.jpa.util.EnumUtils;

import java.util.Objects;

public interface BaseEnumConverter<E extends Enum<E> & EnumCommonApi<E>> extends StandardConverter<E, String> {

    Class<E> getEClass();

    @Override
    default String convertToDatabaseColumn(E attribute) {
        return Objects.isNull(attribute) ? null : toRelationalValue(attribute);
    }

    @Override
    default E convertToEntityAttribute(String dbData) {
        return Objects.isNull(dbData) ? null : toDomainValue(dbData);
    }

    @Override
    default E toDomainValue(String s) {
        return EnumUtils.of(this.getEClass(), E::getEnumField, s);
    }

    @Override
    default String toRelationalValue(E e) {
        return Objects.requireNonNull(e).getEnumField();
    }

    @Override
    default JavaType<E> getDomainJavaType() {
        return new EnumJavaType<>(this.getEClass());
    }

    @Override
    default JavaType<String> getRelationalJavaType() {
        return StringJavaType.INSTANCE;
    }
}
