package me.javaroad.plugins.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *
 */
@AllArgsConstructor
@Getter
@Setter
public class TreeNode {
    private Type type;
    private String name;

    public enum Type {
        TEMPLATE("Template"),
        GROUP("Group");
        @Getter
        private String name;

        Type(String name) {
            this.name = name;
        }
    }
}
