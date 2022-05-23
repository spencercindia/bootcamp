<template>
  <div class="book-container">
    <BookCard
      v-for="book in this.$store.state.books"
      v-bind:key="book.id"
      v-bind:books="book"
    ></BookCard>
  </div>
</template>

<script>
import BookCard from "./BookCard.vue";

export default {
  name: "reading-list",
  components: { BookCard },
};
</script>

<style>
.book-container {
  display: flex;
  justify-content: space-evenly;
  flex-wrap: wrap;
}
</style>