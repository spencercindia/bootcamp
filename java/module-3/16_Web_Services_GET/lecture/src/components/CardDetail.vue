<template>
  <div>
    <div v-if="isLoading">
      <img src="../assets/ping_pong_loader.gif" alt="" />
    </div>
    <div v-else>
      <h1>{{ card.title }}</h1>
      <p>{{ card.description }}</p>
      <comments-list v-bind:comments="card.comments"></comments-list>
      <router-link
        v-bind:to="{ name: 'Board', params: { id: $route.params.boardID } }"
        >Back to Board</router-link
      >
    </div>
  </div>
</template>

<script>
import boardService from "../services/BoardService";
import CommentsList from "../components/CommentsList";
export default {
  name: "card-detail",
  components: {
    CommentsList,
  },
  data() {
    return {
      card: {
        title: "",
        description: "",
        status: "",
        comments: [],
      },
      isLoading: true,
    };
  },

  created() {
    boardService
      .getCard(this.$route.params.boardID, this.$route.params.cardID)
      .then((response) => {
        this.card = response;
        this.isLoading = false;
      });
  },
};
</script>
