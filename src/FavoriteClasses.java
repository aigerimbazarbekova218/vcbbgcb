public class FavoriteClasses<T, Y, Z> {
    private T favorite1;
    private Y favorite2;
    private Z favorite3;

    FavoriteClasses(T fav1, Y fav2, Z fav3) {
        this.favorite1 = fav1;
        this.favorite2 = fav2;
        this.favorite3 = fav3;
    }

    public T getTFav1() {
        return (this.favorite1);
    }


    public Y getFav2() {
        return (this.favorite2);
    }


    public Z getFav3() {
        return (this.favorite3);
    }
}
