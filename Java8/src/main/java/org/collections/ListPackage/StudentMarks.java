package org.collections.ListPackage;

import java.util.Collection;

public class StudentMarks implements Comparable<StudentMarks>{

   private int maths;
   private int physics;

    public int getMaths() {
        return maths;
    }

    public int getPhysics(){
        return physics;
    }

    public StudentMarks(int maths, int physics) {
        this.maths = maths;
        this.physics = physics;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "maths=" + maths +
                ", physics=" + physics +
                '}';
    }

    @Override
    public int compareTo(StudentMarks o) {
        return o.maths - this.maths;

        //Current obj < other obj -> return -1
        //Current obj > other obj -> return 1
        //Current obj = other obj -> return p
    }
}
