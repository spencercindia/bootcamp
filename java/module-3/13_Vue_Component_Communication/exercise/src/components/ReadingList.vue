<template>
  <div class="book-container"></div>
</template>

<script>
import BookCard from "../components/BookCard";

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