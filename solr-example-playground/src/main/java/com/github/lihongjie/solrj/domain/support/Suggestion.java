package com.github.lihongjie.solrj.domain.support;

/**
 * Created by lihongjie on 6/25/17.
 */
public class Suggestion {

    private String value;

    private long count;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
