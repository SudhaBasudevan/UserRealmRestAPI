@Service("userService")
public class DefaultUserService implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public String register(String userName, String userDescription) {
        Optional<User> user = userRepository.register(userName,userDescription);
        if(user.isPresent()){
            String encryptedKey = UUID.randomUUID().toString();
            User userObj= user.get();
            userObj.setEncryptedKey(encryptedKey);
            userRepository.save(userObj);
            return encryptedKey;
        }

        return StringUtils.EMPTY;
    }

    
    @Override
    public User findById(Long userID) {
        Optional<User> user= userRepository.findById(userID);
        return user.orElse(null);
    }
}
