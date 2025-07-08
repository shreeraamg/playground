package chapterone;

import chapterone.enums.Builder;
import chapterone.enums.Type;
import chapterone.enums.Wood;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Objects;

public class GuitarSpec {

    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type,
                      Wood backWood, Wood topWood, int numStrings) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumStrings() {
        return numStrings;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GuitarSpec other = (GuitarSpec) o;

        return new EqualsBuilder()
                .append(builder, other.builder)
                .append(model, other.model)
                .append(type, other.type)
                .append(backWood, other.backWood)
                .append(topWood, other.topWood)
                .append(numStrings, other.numStrings)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(builder)
                .append(model)
                .append(type)
                .append(backWood)
                .append(topWood)
                .append(numStrings)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("builder", builder)
                .append("model", model)
                .append("type", type)
                .append("backWood", backWood)
                .append("topWood", topWood)
                .append("numStrings", numStrings)
                .toString();
    }

}
