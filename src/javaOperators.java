
public class javaOperators {
    public static void main(String[] args) {
        //A. Arithmetic operator
        System.out.println("A. Arithmetic operator.........");
        int num_1 = 10;
        int num_2 = 5;
        //    + add
        int add = num_1 + num_2;
        System.out.println(add);
        //    - sub
        int sub =  num_1 - num_2;
        System.out.println(sub);
        //    * mul
        int mul = num_1 * num_2;
        System.out.println(mul);
        //    / div
        int div = num_1 / num_2;
        System.out.println(div);
        //    % mod
        int mod = num_1 % num_2;
        System.out.println(mod);
        //    ++ increment - ++pre and post++
        System.out.println(num_1++);
        System.out.println(++num_1);
        //    -- decrement- --pre and post--
        System.out.println((num_2--));
        System.out.println(--num_2);
        System.out.println(" ");

        //B. Relational operator
        System.out.println("B. Relational operator.........");
        //     == equal to
        System.out.println(num_1 == num_2);
        //     != not equal to
        System.out.println(num_1 != num_2);
        //     < less than
        System.out.println(num_1 < num_2);
        //     > greater than
        System.out.println(num_1 > num_2);
        //     <= less than equal to
        System.out.println(num_1 <= num_2);
        //     >= greater than equal to
        System.out.println(num_1 >= num_2);
        System.out.println(" ");

        //3. Boolean Logical operator
        System.out.println("C. Boolean Logical operator.........");
        //    && logical AND
        System.out.println((num_1 > num_2) && (num_2 < num_1));
        //    || logical OR
        System.out.println((num_1 < num_2) || (num_2 < num_1));
        //    ! logical NOT
        System.out.println(!(num_1 > num_2));
        System.out.println(" ");
        //4. Assignment operator
        System.out.println("D. Assignment operator.........");
        //    = assign
        num_1 = num_2;
        System.out.println(num_1);
        //    += add and assign
        System.out.println(num_1 += num_2);
        //    -= sub and assign
        System.out.println(num_1 -= num_2);
        //    *= mul and assign
        System.out.println(num_1 *= num_2);
        //    /= div and assign
        System.out.println(num_1 /= num_2);
        //    %= mod and assign
        System.out.println(num_1 %= num_2);
        System.out.println(" ");
        //5. Unary operator
        System.out.println("E. Unary operator.........");
        //     + unary plus = turns value to positive
        System.out.println(+num_1);
        //     - unary minus = turns value to negative
        System.out.println(-num_2);
        //     ++ increment = adds one
        System.out.println(++num_1);
        //     -- decrement = subtracts one
        System.out.println(--num_2);
        //     ! logical complement = reverse the value
        boolean flag = false;
        System.out.println(!flag);

        System.out.println(" ");
        //6. Bitwise Logical operator
        System.out.println("F. Bitwise Logical operator.........");
        //    & bitwise AND //if both bit  1 then return 1
        System.out.println(num_1 & num_2);
        //    | bitwise OR // if one bit 1 then return 1
        System.out.println(num_1 | num_2);
        //    ^ bitwise XOR // if same bits returns different
        System.out.println(num_1 ^ num_2);
        //    ~ bitwise NOT // inverts all the bits
        System.out.println(~num_1);
        //    << left shift
        System.out.println(num_1 << 2);
        //    >> right shift
        System.out.println(num_1 >> 2);

    }



}
