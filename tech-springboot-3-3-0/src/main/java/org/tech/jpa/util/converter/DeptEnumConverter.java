package org.tech.jpa.util.converter;

import jakarta.persistence.Converter;
import org.tech.jpa.enums.DeptEnum;

@Converter
public class DeptEnumConverter implements BaseEnumConverter<DeptEnum> {
    @Override
    public Class<DeptEnum> getEClass() {
        return DeptEnum.class;
    }
}
