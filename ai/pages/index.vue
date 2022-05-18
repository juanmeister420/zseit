<template>
  <div class="max-w-5xl mx-auto lg:flex lg:justify-evenly lg:items-start">
    <div class="flex flex-col items-center justify-center text-center lg:mt-10">
      
      <div class="p-4">
        <h1 class="text-3xl font-bold text-indigo-500">Kamień, papier nożyce</h1>
        <h2 class="text-base text-indigo-500">Z wykorzystaniem sztucznej inteligencji</h2>
      </div>
      <div class="p-4">
        <h2 class="text-2xl font-semibold text-indigo-500">
          Wynik
        </h2>
        <div class="flex items-center mt-4 items-row justify-evenly">
          <div class="w-1/2 border-r border-indigo-500">
            <p class="text-3xl text-indigo-500">{{ scoreHuman }}</p>
            <p class="mt-4 text-xl">Ty</p>
            <p class="mt-4">{{ showChosenByHuman }}</p>
          </div>
          <div class="w-1/2">
            <p class="text-3xl text-indigo-500">{{ scoreAI }}</p>
            <p class="mt-4 text-xl">BOT</p>
            <p class="mt-4">{{ showChosenByAI }}</p>
          </div>
        </div>
        <div class="my-6 text-2xl font-bold">
          <p v-if="this.winner === 'human'" class="text-indigo-500">
            Wygrałeś!
          </p>
          <p v-else-if="this.winner === 'AI'" class="text-red-500">
            Przegrałeś!
          </p>
          <p v-else-if="this.winner === 'draw'" class="text-blue-500">
            Remis!
          </p>
          <p v-else class="text-gray-700">Wybierz</p>
        </div>
        <div class="mt-4">
          <div class="flex flex-row items-center justify-center">
            <button
              @click="humanInput(1)"
              class="px-4 py-2 m-2 text-white duration-500 bg-indigo-500 rounded hover:bg-indigo-600"
            >
              Kamień
            </button>
            <button
              @click="humanInput(2)"
              class="px-4 py-2 m-2 text-white duration-500 bg-indigo-500 rounded hover:bg-indigo-600"
            >
              Papier
            </button>
            <button
              @click="humanInput(3)"
              class="px-4 py-2 m-2 text-white duration-500 bg-indigo-500 rounded hover:bg-indigo-600"
            >
             Nożyce
            </button>
          </div>
          <div>
            <button
              @click="resetScore"
              class="px-4 py-2 m-2 text-indigo-500 border rounded"
            >
              Resetuj
            </button>
          </div>
          <div class="mt-8">
            <p>Liczba gier: {{ gameCount }}</p>
          </div>
        </div>
      </div>
    </div>
    <div class="lg:ml-16" >
      <div class="p-4 mt-4 prose lg:prose-xl shit">
        <h2>
          Co to jest?
        </h2>
        <div>
          <p>
            
          </p>
          <p>
            Gra w kamień, papier, nożyce w której gramy przeciwko botowi, który uczy się na bierząco i przewiduje następny ruch gracza.
          </p>
          <p>Zbudowano w technologii brain.js</p>
        </div>
      </div>

      <div class="p-4 mt-4 prose lg:prose-xl shit">
        <h2>
          Jak?
        </h2>
        <div>
          <ol>
            <li>
              Gracz wybiera jeden z trzech ruchów: kamień, papier, nożyce.
            </li>
            <li>
              Bot zapisuje ten ruch, dodając go do zmiennej <b>pattern</b>.
            </li>
            <li>
              Po ruchu gracza, uruchamiana jest funkcja, która przygotowywuje dane do treningu.
            </li>
            <li>
              Bot jest trenowany przy użyciu świeżych danych.
            </li>
            <li>
              Zdefiniowanie ruchu Bota, ustalonego na podstawie wyniku działania sieci.
            </li>
          </ol>
        </div>
      </div>

      <div class="p-4 mt-4 prose lg:prose-xl">
        <h2>
         Źródła:
        </h2>
        <div>
          <p>
            
            <a href="https://github.com/BrainJS/brain.js">Brain JS</a>
          </p>
          <p>
            
            <a href="https://github.com/arifikhsan/batu-gunting-kertas-nuxt"
              >Github</a
            >
          </p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  head: {
    title: 'Kamień Papier i nożyczki d-_-b',
    script: [{ src: '//unpkg.com/brain.js' }]
  },
  data() {
    return {
      pattern: [],
      scoreHuman: 0,
      scoreAI: 0,
      chosenByHuman: 0,
      chosenByAI: 0,
      winner: '', // human or AI or draw
      gameCount: 0,
      patternLength: 10
    }
  },
  computed: {
    showChosenByHuman() {
      return this.stringOf(this.chosenByHuman)
    },
    showChosenByAI() {
      return this.stringOf(this.chosenByAI)
    }
  },
  methods: {
    async humanInput(rockOrPaperOrScissors) {
      this.chosenByHuman = rockOrPaperOrScissors
      this.gameCount++
      await this.whatShouldAIAnswer()
      this.whoIsTheWinner()
    },
    prepareData() {
      if (this.pattern.length < 1) {
        for (let index = 1; index <= this.patternLength; index++) {
          // Rozdzielenie danych, które będą używane do uczenia
          this.pattern.push(Math.floor(Math.random() * 3) + 1)
        }
      }
    },
    updatePattern() {
      if (this.gameCount !== 0) {
        // Dodawanie danych do uczenia
        this.pattern.shift()
        this.pattern.push(this.chosenByHuman)
      }
      
    },
    async whatShouldAIAnswer() {
      this.prepareData() // Przygotownie danych tj. stworzenie modelu [1,2,3, ...]
      const net = new brain.recurrent.LSTMTimeStep() // Tworzenie sieci
      net.train([this.pattern], { iterations: 100, log: true }) // Trenowanie sieci
      const humanWillChose = net.run(this.pattern) // Wykorzystanie sieci do wyboru
      this.updatePattern()
      const roundedHumanWillChose = Math.round(humanWillChose)
      // Wykonanie ruchu przez bota
      this.chosenByAI = 1 <= roundedHumanWillChose && roundedHumanWillChose <= 3 ? (roundedHumanWillChose % 3) + 1 : 1 
      console.log('🧠: ' + roundedHumanWillChose + '  🤖: ' + this.chosenByAI)
    },
    whoIsTheWinner() {
      if (this.chosenByHuman === this.chosenByAI) {
        this.winner = 'draw'
      } else if (
        (this.chosenByHuman === 1 && this.chosenByAI === 3) ||
        (this.chosenByHuman === 3 && this.chosenByAI === 2) ||
        (this.chosenByHuman === 2 && this.chosenByAI === 1)
      ) {
        this.winner = 'human'
        this.scoreHuman++
      } else {
        this.winner = 'AI'
        this.scoreAI++
      }
    },
    resetScore() {
      this.pattern = []
      this.scoreHuman = 0
      this.scoreAI = 0
      this.chosenByHuman = 0
      this.chosenByAI = 0
      this.winner = ''
      this.gameCount = 0
    },
    stringOf(integer) {
      switch (integer) {
        case 1:
          return "Kamień"
        case 2:
          return "Papier"
        case 3:
          return "Nożyce"

        default:
          return ''
      }
    }
  }
}
</script>
