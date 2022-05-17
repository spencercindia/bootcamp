<template>
  <!-- HTML Section -->
  <div class="main">
    <h2>Product Reviews for {{ name }}</h2>
    <p class="description">{{ description }}</p>
    <div class="well-display">
      <div class="well">
        <span class="amount">{{ averageRating }}</span>
        Average Rating
      </div>
      <div class="well">
        <span class="amount">{{ numberOfOneStarReviews }}</span>
        1 Star Review
      </div>
      <div class="well">
        <span class="amount">{{ numberOfTwoStarReviews }}</span>
        2 Star Review
      </div>
      <div class="well">
        <span class="amount">{{ numberOfThreeStarReviews }}</span>
        3 Star Review
      </div>
      <div class="well">
        <span class="amount">{{ numberOfFourStarReviews }}</span>
        4 Star Review
      </div>
      <div class="well">
        <span class="amount">{{ numberOfFiveStarReviews }}</span>
        5 Star Review
      </div>
    </div>
    <div
      class="review"
      v-bind:class="{ favorited: review.favorited }"
      v-for="review in reviews"
      v-bind:key="review.id"
    >
      <h4>{{ review.reviewer }}</h4>
      <div class="rating">
        <img
          src="..\assets\star.png"
          v-bind:title="review.rating + 'Star Review'"
          class="ratingStar"
          v-for="star in review.rating"
          v-bind:key="star"
        />
      </div>
      <h3>{{ review.title }}</h3>
      <p>{{ review.review }}</p>
      <p>Favorite?<input type="checkbox" v-model="review.favorited" /></p>
    </div>
  </div>
</template>

<script>
// Javascript Section
export default {
  name: "product-review",
  data() {
    return {
      name: "Cigar Party for Dummies",
      description:
        "Host and plan the perfect cigar party for all your squirrelly friends.",
      reviews: [
        {
          reviewer: "Baba Voss",
          title: "I'm Blind",
          review: "But this was a great read nonetheless",
          rating: 5,
        },
        {
          reviewer: "Doug",
          title: "Okay",
          review: "Alright alright alright alright",
          rating: 3,
        },
        {
          reviewer: "Literally Obama",
          title: "I haven't smoked since college",
          review: "Until I read this book, 5 stars!",
          rating: 5,
        },
      ],
    };
  },
  computed: {
    averageRating() {
      let sum = this.reviews.reduce(
        (currentSum, review) => currentSum + review.rating,
        0
      );
      return (sum / this.reviews.length).toFixed(2);
    },
    numberOfOneStarReviews() {
      return this.reviews.reduce((currentCount, review) => {
        return currentCount + (review.rating === 1);
      }, 0);
    },
    numberOfTwoStarReviews() {
      return this.reviews.reduce((currentCount, review) => {
        return currentCount + (review.rating === 2);
      }, 0);
    },
    numberOfThreeStarReviews() {
      return this.reviews.reduce((currentCount, review) => {
        return currentCount + (review.rating === 3);
      }, 0);
    },
    numberOfFourStarReviews() {
      return this.reviews.reduce((currentCount, review) => {
        return currentCount + (review.rating === 4);
      }, 0);
    },
    numberOfFiveStarReviews() {
      return this.reviews.reduce((currentCount, review) => {
        return currentCount + (review.rating === 5);
      }, 0);
    },
  },
};
</script>

<style scoped>
div.main {
  margin: 1rem 0;
}
div.main div.well-display {
  display: flex;
  justify-content: space-around;
}

div.main div.well-display div.well {
  display: inline-block;
  width: 15%;
  border: 1px black solid;
  border-radius: 6px;
  text-align: center;
  margin: 0.25rem;
}

div.main div.well-display div.well span.amount {
  color: darkslategray;
  display: block;
  font-size: 2.5rem;
}

div.main div.review {
  border: 1px black solid;
  border-radius: 6px;
  padding: 1rem;
  margin: 10px;
}

div.main div.review div.rating {
  height: 2rem;
  display: inline-block;
  vertical-align: top;
  margin: 0 0.5rem;
}

div.main div.review div.rating img {
  height: 100%;
}

div.main div.review p {
  margin: 20px;
}

div.main div.review h3 {
  display: inline-block;
}

div.main div.review h4 {
  font-size: 1rem;
}
div.main div.review.favorited {
  background-color: lightyellow;
}
</style>
