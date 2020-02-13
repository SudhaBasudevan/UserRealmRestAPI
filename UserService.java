public interface UserService {

    String register(String userName, String userDescription);
    
    User findById(Long userID);
}
