@RestController
public class EncryptedKeyController {

    @Autowired
    private UserService userService;

    @PostMapping("/encryptedKey")
    public String getEncryptedKey(@RequestParam("userName") final String userName, @RequestParam("userDescription") final String userDescription){
       String encryptedKey= userService.register(userName,userDescription);
       if(StringUtils.isEmpty(encryptedKey)){
           return "no encryptedKey found";
       }
       return encryptedKey;
    }
}
