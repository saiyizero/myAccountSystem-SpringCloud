package com.virugan.interfac;

import java.io.Serializable;
import java.util.LinkedHashMap;

public abstract class myComponent {

    protected LinkedHashMap primkeyMap;

    public abstract LinkedHashMap getPrimaryKey();

    public abstract String getTableName();
}
