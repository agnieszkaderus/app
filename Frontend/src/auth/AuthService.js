import axios from 'axios';

const API_URL = "http://localhost:8080/user/";

class AuthService {

    login(email, password){
        return axios.post(API_URL + "login", {
            email,
            password
        }).then(response => {
            if(response.data.token){
                localStorage.setItem("user", JSON.stringify(response.data));
            }
            return response.data;
        });
    }

    logout(){
        localStorage.removeItem("user");
        localStorage.removeItem("token");
    }

    register(email, password, name, contactNumber){
        return axios.post(API_URL + "signup", {
            "name": name,
            "email": email,
            "contactNumber": contactNumber,
            "password": password,
        });
    }

    getCurrentUser(){
        return JSON.parse(localStorage.getItem("user"))
    }
}

export default new AuthService()
