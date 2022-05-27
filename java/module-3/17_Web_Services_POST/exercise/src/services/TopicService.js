import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:3000"
});

export default {

  list() {
    return http.get('/topics');
  },

  get(id) {
    return http.get(`/topics/${id}`);
  },

  newTopic(topic) {
    return http.post(`/topics/${topic}`);
  },

  putTopic(topic) {
    return http.put(`/topics/${topic.id}`)
  }

}
