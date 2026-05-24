package org.tech.jpa.enums;

public interface EnumCommonApi<E extends Enum & EnumCommonApi<E>>{

    String getEnumField();
}
