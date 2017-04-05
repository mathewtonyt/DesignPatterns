/**
 * Created by mtony on 3/17/17.
 */
package com.matt.builderpattern;

public class MyObject
{
    private String id;
    private String lname;
    private String fname;
    private String school;

    private MyObject(Builder builder) {
        id = builder.id;
        lname = builder.lname;
        fname = builder.fname;
        school = builder.school;
    }

    public String getId() {
        return id;
    }

    public String getLname() {
        return lname;
    }

    public String getFname() {
        return fname;
    }

    public String getSchool() {
        return school;
    }


    /**
     * {@code MyObject} builder static inner class.
     */
    public static final class Builder {
        private String id;
        private String lname;
        private String fname;
        private String school;

        public Builder() {
        }

        /**
         * Sets the {@code id} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code id} to set
         * @return a reference to this Builder
         */
        public Builder withId(String val) {
            id = val;
            return this;
        }

        /**
         * Sets the {@code lname} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code lname} to set
         * @return a reference to this Builder
         */
        public Builder withLname(String val) {
            lname = val;
            return this;
        }

        /**
         * Sets the {@code fname} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code fname} to set
         * @return a reference to this Builder
         */
        public Builder withFname(String val) {
            fname = val;
            return this;
        }

        /**
         * Sets the {@code school} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code school} to set
         * @return a reference to this Builder
         */
        public Builder withSchool(String val) {
            school = val;
            return this;
        }

        /**
         * Returns a {@code MyObject} built from the parameters previously set.
         *
         * @return a {@code MyObject} built with parameters of this {@code MyObject.Builder}
         */
        public MyObject build() {
            return new MyObject(this);
        }
    }
}
