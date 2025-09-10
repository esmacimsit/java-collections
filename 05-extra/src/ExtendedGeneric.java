class ExtendedGeneric<T extends Number> {
    T[] nums;

    ExtendedGeneric(T[] nums){
        this.nums = nums;
    }

    double average(){
        double sum = 0;
        for (T num : nums){
            sum += num.doubleValue(); // converting for calculation
        }
        return sum / nums.length;
    }
}
